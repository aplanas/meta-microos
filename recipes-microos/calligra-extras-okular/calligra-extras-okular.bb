SUMMARY = "Plugin for Okular"
DESCRIPTION = "Plugins for Okular supporting files in the formats ODP, ODT, MS DOC/DOCX, MS PPT/PPTX, and WPD."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-okular-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "da11e853ffd836af38b2be4d283b0f7d3700c0952e8601bf3dac222c2599b89c3e01e9caac86f0f9219d0fbd35276b53b344168a4308fb1cf2b19ee4360edbd7"

RPROVIDES:${PN} += "application() \
application(okularApplication_doc_calligra.desktop) \
application(okularApplication_docx_calligra.desktop) \
application(okularApplication_odp_calligra.desktop) \
application(okularApplication_odt_calligra.desktop) \
application(okularApplication_powerpoint_calligra.desktop) \
application(okularApplication_pptx_calligra.desktop) \
application(okularApplication_rtf_calligra.desktop) \
application(okularApplication_wpd_calligra.desktop) \
calligra-extras-okular \
calligra-extras-okular(aarch-64) \
libkookularGenerator_odp.so.17()(64bit) \
libkookularGenerator_odt.so.17()(64bit) \
mimehandler(application/msword) \
mimehandler(application/rtf) \
mimehandler(application/vnd.ms-powerpoint) \
mimehandler(application/vnd.oasis.opendocument.presentation) \
mimehandler(application/vnd.oasis.opendocument.presentation-template) \
mimehandler(application/vnd.oasis.opendocument.text) \
mimehandler(application/vnd.oasis.opendocument.text-template) \
mimehandler(application/vnd.openxmlformats-officedocument.presentationml.presentation) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.document) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.template) \
mimehandler(application/vnd.wordperfect) \
mimehandler(text/rtf)"
RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libOkular5Core.so.10()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libflake.so.17()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkomain.so.17()(64bit) \
libkoodf.so.17()(64bit) \
libkopageapp.so.17()(64bit) \
libkotext.so.17()(64bit) \
libkotextlayout.so.17()(64bit) \
libkowidgets.so.17()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwordsprivate.so.17()(64bit) \
okular"

inherit rpm
