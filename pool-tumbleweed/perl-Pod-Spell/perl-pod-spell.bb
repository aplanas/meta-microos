SUMMARY = "Formatter for spellchecking Pod"
DESCRIPTION = "Pod::Spell is a Pod formatter whose output is good for spellchecking. \
Pod::Spell is rather like Pod::Text, except that it doesn't put much effort \
into actual formatting, and it suppresses things that look like Perl \
symbols or Perl jargon (so that your spellchecking program won't complain \
about mystery words like ''$thing'' or ''Foo::Bar'' or 'hashref'). \
 \
This class works by filtering out words that look like Perl or any form of \
computerese (like ''$thing'' or ''N>7'' or ''@{$foo}{'bar','baz'}'', \
anything in C<...> or F<...> codes, anything in verbatim paragraphs (code \
blocks), and anything in the stopword list. The default stopword list for a \
document starts out from the stopword list defined by Pod::Wordlist, and \
can be supplemented (on a per-document basis) by having ''=for stopwords'' \
/ ''=for :stopwords'' region(s) in a document."
LICENSE = "Artistic-2.0"

PV = "1.26"

RPM_NAME = "perl-Pod-Spell-1.26-1.3.noarch.rpm"
RPM_HASH = "491d6c4fc66fe95a84f2c9fcd66743c1abf992adf2e94d146628ac5d04a8e0af281efccb96667a36d458bdfb3c0ee26391bc3496f2a3a5de0cf1d28826e9b45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Spell \
perl-Pod--Wordlist \
perl-Pod-Spell"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Class--Tiny \
perl-File--ShareDir \
perl-Lingua--EN--Inflect \
perl-Pod--Escapes \
perl-Pod--Simple \
perl-parent"

inherit rpm
