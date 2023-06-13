SUMMARY = "Header files of libiconv-hook"
DESCRIPTION = "Development and header files for libiconv_hook1"
LICENSE = "OpenSSL"

PV = "0.0.20021209"

RPM_NAME = "libiconv_hook-devel-0.0.20021209-1.27.aarch64.rpm"
RPM_HASH = "f4fcb9497bff0347b2c7ae56dfb77d9aa9ccfe8d2f7f83c76f40a215c72ca9241baea8525ffa6f155e8b0899c207bf3788b228cfe6fbe39bd16100324f608980"

RPROVIDES:${PN} += "libiconv_hook-devel \
libiconv_hook-devel(aarch-64)"

RDEPENDS:${PN} += "libiconv_hook1"

inherit rpm
