SUMMARY = "Development tools for deepin-session-shell"
DESCRIPTION = "The deepin-session-shell-devel package contains the header files and developer \
docs for deepin-session-shell-devel."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "deepin-session-shell-devel-5.5.48-1.4.aarch64.rpm"
RPM_HASH = "d728badf6f9d0cb261cf58bf5f9381c98978f8ec3cc1cc43d52f0096f5266ea353b285bc6507e1c865b4e47ce84a3439bc37ecd972d9a17c8bc3e50af878797e"

RPROVIDES:${PN} += "cmake(DdeSessionShell) \
deepin-session-shell-devel \
deepin-session-shell-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
