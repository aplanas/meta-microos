SUMMARY = "Save a tree AND a kitten, use common::sense!"
DESCRIPTION = "   “Nothing is more fairly distributed than common sense: no one thinks \
   he needs more of it than he already has.” \
 \
   – René Descartes \
 \
This module implements some sane defaults for Perl programs, as defined by \
two typical (or not so typical - use your common sense) specimens of Perl \
coders. In fact, after working out details on which warnings and strict \
modes to enable and make fatal, we found that we (and our code written so \
far, and others) fully agree on every option, even though we never used \
warnings before, so it seems this module indeed reflects a 'common' sense \
among some long-time Perl coders. \
 \
The basic philosophy behind the choices made in common::sense can be \
summarised as: 'enforcing strict policies to catch as many bugs as \
possible, while at the same time, not limiting the expressive power \
available to the programmer'. \
 \
Two typical examples of how this philosophy is applied in practise is the \
handling of uninitialised and malloc warnings: \
 \
* _uninitialised_ \
 \
'undef' is a well-defined feature of perl, and enabling warnings for using \
it rarely catches any bugs, but considerably limits you in what you can do, \
so uninitialised warnings are disabled. \
 \
* _malloc_ \
 \
Freeing something twice on the C level is a serious bug, usually causing \
memory corruption. It often leads to side effects much later in the program \
and there are no advantages to not reporting this, so malloc warnings are \
fatal by default. \
 \
Unfortunately, there is no fine-grained warning control in perl, so often \
whole groups of useful warnings had to be excluded because of a single \
useless warning (for example, perl puts an arbitrary limit on the length of \
text you can match with some regexes before emitting a warning, making the \
whole 'regexp' category useless). \
 \
What follows is a more thorough discussion of what this module does, and \
why it does it, and what the advantages (and disadvantages) of this \
approach are."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "3.75"

RPM_NAME = "perl-common-sense-3.75-1.14.aarch64.rpm"
RPM_HASH = "787307ae8e61ff713e1bbe01768ebab3fbcd591c232afe12cf0422f7320aae47a29714398e1fe6b7500eb7695947c50e373d2ceab21f3646c9ae08c21cb7e1e5"

RPROVIDES:${PN} += "perl-common--sense \
perl-common-sense"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
