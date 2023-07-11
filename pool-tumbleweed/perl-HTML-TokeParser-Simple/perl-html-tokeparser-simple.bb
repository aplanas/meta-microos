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

RPM_NAME = "perl-HTML-TokeParser-Simple-3.16-5.25.noarch.rpm"
RPM_HASH = "cfe3f80b87626d60d6d8b73bd41d9b37e45200547d9efde743c5c2a811ab7e11be6c83ce0274da6c651d11d6cd38f0f59848f896f53e23cd4fe53f8a433343bd"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Parser \
perl-HTML--TokeParser \
perl-Sub--Override"

inherit rpm
