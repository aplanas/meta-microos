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

RPM_NAME = "perl-MIME-Types-2.24-1.2.noarch.rpm"
RPM_HASH = "448d60e60cedebaabefe65ef65cedfa48badff64455d7189e105e7f7bd9d156c166d80db37c3d75bb45b2077ce6e7a1835fbe09509a72c8a584988a419beff53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MIME::Type) \
perl(MIME::Types) \
perl(MojoX::MIME::Types) \
perl-MIME-Types"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
