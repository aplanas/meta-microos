SUMMARY = "LibreOffice Calc"
DESCRIPTION = "This module allows you to perform calculation, analyze information and \
manage lists in spreadsheets by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-calc-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "4016a801dc4c98c7b8c3121387dcb19932b221275f56686747ca1d816df38eb7c076514d78de9af966a5fe6d2d3e633328806e1142dca1c9a4964ed93ec08e37"

RPROVIDES:${PN} += "application() \
application(libreoffice-calc.desktop) \
libanalysislo.so()(64bit) \
libcalclo.so()(64bit) \
libdatelo.so()(64bit) \
libpricinglo.so()(64bit) \
libreoffice-calc \
libreoffice-calc(aarch-64) \
libscdlo.so()(64bit) \
libscfiltlo.so()(64bit) \
libsclo.so()(64bit) \
libscuilo.so()(64bit) \
libsolverlo.so()(64bit) \
libvbaobjlo.so()(64bit) \
libwpftcalclo.so()(64bit) \
metainfo() \
metainfo(libreoffice-calc.appdata.xml) \
mimehandler(application/clarisworks) \
mimehandler(application/csv) \
mimehandler(application/excel) \
mimehandler(application/msexcel) \
mimehandler(application/tab-separated-values) \
mimehandler(application/vnd.apple.numbers) \
mimehandler(application/vnd.lotus-1-2-3) \
mimehandler(application/vnd.ms-excel) \
mimehandler(application/vnd.ms-excel.sheet.binary.macroEnabled.12) \
mimehandler(application/vnd.ms-excel.sheet.macroEnabled.12) \
mimehandler(application/vnd.ms-excel.template.macroEnabled.12) \
mimehandler(application/vnd.ms-works) \
mimehandler(application/vnd.oasis.opendocument.chart) \
mimehandler(application/vnd.oasis.opendocument.chart-template) \
mimehandler(application/vnd.oasis.opendocument.spreadsheet) \
mimehandler(application/vnd.oasis.opendocument.spreadsheet-flat-xml) \
mimehandler(application/vnd.oasis.opendocument.spreadsheet-template) \
mimehandler(application/vnd.openxmlformats-officedocument.spreadsheetml.sheet) \
mimehandler(application/vnd.openxmlformats-officedocument.spreadsheetml.template) \
mimehandler(application/vnd.sun.xml.calc) \
mimehandler(application/vnd.sun.xml.calc.template) \
mimehandler(application/x-123) \
mimehandler(application/x-dbase) \
mimehandler(application/x-dbf) \
mimehandler(application/x-dos_ms_excel) \
mimehandler(application/x-excel) \
mimehandler(application/x-iwork-numbers-sffnumbers) \
mimehandler(application/x-ms-excel) \
mimehandler(application/x-msexcel) \
mimehandler(application/x-quattropro) \
mimehandler(application/x-starcalc) \
mimehandler(text/comma-separated-values) \
mimehandler(text/csv) \
mimehandler(text/spreadsheet) \
mimehandler(text/tab-separated-values) \
mimehandler(text/x-comma-separated-values) \
mimehandler(text/x-csv)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclewlo.so()(64bit) \
libetonyek-0.1.so.1()(64bit) \
libfilelo.so()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libi18nlangtag.so()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
liblpsolve55.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmergedlo.so()(64bit) \
libmwaw-0.3.so.3()(64bit) \
libodfgen-0.1.so.1()(64bit) \
libooxlo.so()(64bit) \
liborcus-0.17.so.0()(64bit) \
liborcus-parser-0.17.so.0()(64bit) \
libreoffice \
librevenge-0.0.so.0()(64bit) \
libstaroffice-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) \
libuno_cppu.so.3(UDK_3.1)(64bit) \
libuno_cppu.so.3(UDK_3.3)(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) \
libuno_cppuhelpergcc3.so.3(LIBO_UDK_7.4)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3.1)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3.3)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3.6)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(LIBO_UDK_3.5)(64bit) \
libuno_sal.so.3(LIBO_UDK_3.6)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.0)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.1)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.2)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.3)(64bit) \
libuno_sal.so.3(LIBO_UDK_5.1)(64bit) \
libuno_sal.so.3(LIBO_UDK_5.3)(64bit) \
libuno_sal.so.3(PRIVATE_1.6)(64bit) \
libuno_sal.so.3(PRIVATE_1.7)(64bit) \
libuno_sal.so.3(PRIVATE_1.8)(64bit) \
libuno_sal.so.3(UDK_3.1)(64bit) \
libuno_sal.so.3(UDK_3.10)(64bit) \
libuno_sal.so.3(UDK_3.3)(64bit) \
libuno_sal.so.3(UDK_3.6)(64bit) \
libuno_sal.so.3(UDK_3.7)(64bit) \
libuno_sal.so.3(UDK_3.8)(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libuno_salhelpergcc3.so.3()(64bit) \
libuno_salhelpergcc3.so.3(LIBO_UDK_3.6)(64bit) \
libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libwps-0.4.so.4()(64bit) \
libwriterperfectlo.so()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
rtld(GNU_HASH)"

inherit rpm
