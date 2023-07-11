SUMMARY = "Definition of MIME types"
DESCRIPTION = "MIME types are used in many applications (for instance as part of e-mail \
and HTTP traffic) to indicate the type of content which is transmitted. or \
expected. See RFC2045 at _https://www.ietf.org/rfc/rfc2045.txt_ \
 \
Sometimes detailed knowledge about a mime-type is need, however this module \
only knows about the file-name extensions which relate to some filetype. It \
can also be used to produce the right format: types which are not \
registered at IANA need to use 'x-' prefixes. \
 \
This object administers a huge list of known mime-types, combined from \
various sources. For instance, it contains *all IANA* types and the \
knowledge of Apache. Probably the most complete table on the net!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.24"

RPM_NAME = "perl-MIME-Types-2.24-1.3.noarch.rpm"
RPM_HASH = "3ea8a0afa2826c21d15f9a26d0bbe081a8b763a33c5b9b26f1b2f88f6ca134cb3b247178b3915972d515ae32d8b4bc8a13d9889c2facfa39cf79fa38d68879ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Type \
perl-MIME--Types \
perl-MIME-Types \
perl-MojoX--MIME--Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
