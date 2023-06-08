SUMMARY = "Text highlight plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to highlight syntax of mails and their attachments."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.1"

RPM_NAME = "evolution-plugin-text-highlight-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "ab5c610cde6ca771723b9b1d44169387dfdbc72b91695fbed920a73eed1717bf0af67d6268d91e94cc5980bcd340c88f7d4fd68abf9a65c52abde9ef79352749"

RPROVIDES:${PN} += "evolution-plugin-text-highlight evolution-plugin-text-highlight(aarch-64)"
RDEPENDS:${PN} += "evolution highlight ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libedataserver-1.2.so.27()(64bit) libevolution-mail-formatter.so()(64bit) libevolution-mail.so()(64bit) libevolution-shell.so()(64bit) libevolution-util.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libsoup-3.0.so.0()(64bit)"

inherit rpm
