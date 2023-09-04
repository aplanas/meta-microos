SUMMARY = "Easy to use C<HTML::TokeParser> interface"
DESCRIPTION = "'HTML::TokeParser' is an excellent module that's often used for parsing \
HTML. However, the tokens returned are not exactly intuitive to parse: \
 \
 ['S',  $tag, $attr, $attrseq, $text] \
 ['E',  $tag, $text] \
 ['T',  $text, $is_data] \
 ['C',  $text] \
 ['D',  $text] \
 ['PI', $token0, $text] \
 \
To simplify this, 'HTML::TokeParser::Simple' allows the user ask more \
intuitive (read: more self-documenting) questions about the tokens \
returned. \
 \
You can also rebuild some tags on the fly. Frequently, the attributes \
associated with start tags need to be altered, added to, or deleted. This \
functionality is built in. \
 \
Since this is a subclass of 'HTML::TokeParser', all 'HTML::TokeParser' \
methods are available. To truly appreciate the power of this module, please \
read the documentation for 'HTML::TokeParser' and 'HTML::Parser'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.16"

RPM_NAME = "perl-HTML-TokeParser-Simple-3.16-5.26.noarch.rpm"
RPM_HASH = "e6fca2e559310e98defa8eb8b34fd7f26eaec246535ff136bed325cf4ba5a8d1b25be80d1e7be0b2ed0baf1df2215617a9f14308e600f42e79aff2401ed8f378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--TokeParser--Simple \
perl-HTML--TokeParser--Simple--Token \
perl-HTML--TokeParser--Simple--Token--Comment \
perl-HTML--TokeParser--Simple--Token--Declaration \
perl-HTML--TokeParser--Simple--Token--ProcessInstruction \
perl-HTML--TokeParser--Simple--Token--Tag \
perl-HTML--TokeParser--Simple--Token--Tag--End \
perl-HTML--TokeParser--Simple--Token--Tag--Start \
perl-HTML--TokeParser--Simple--Token--Text \
perl-HTML-TokeParser-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Parser \
perl-HTML--TokeParser \
perl-Sub--Override"

inherit rpm
