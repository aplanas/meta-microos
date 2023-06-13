SUMMARY = "Personal Finance Manager"
DESCRIPTION = "GnuCash is a personal finance manager. A check book-like register GUI \
allows you to enter and track bank accounts, stocks, income, and even \
currency trades. \
 \
Feature Highlights: \
 \
 * Double-Entry Accounting; \
 * Stock/Bond/Mutual Fund Accounts; \
 * Small-Business Accounting; \
 * Reports, Graphs; \
 * QIF/OFX/HBCI Import, Transaction Matching; \
 * Scheduled Transactions; \
 * Financial Calculations."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "gnucash-4.14-1.3.aarch64.rpm"
RPM_HASH = "7da133571d30d3b92c79117d5a4fa474b6d92b401a26636c43c96822c8fa9446de9e984ebced673026b08b4c819d7f15e625b7a2c50dff2a87dba6d2cee74af2"

RPROVIDES:${PN} += "application() \
application(gnucash.desktop) \
config(gnucash) \
gnucash \
gnucash(aarch-64) \
libgnc-app-utils.so()(64bit) \
libgnc-backend-sql.so()(64bit) \
libgnc-backend-xml-utils.so()(64bit) \
libgnc-bi-import.so()(64bit) \
libgnc-core-utils.so()(64bit) \
libgnc-csv-export.so()(64bit) \
libgnc-csv-import.so()(64bit) \
libgnc-customer-import.so()(64bit) \
libgnc-engine.so()(64bit) \
libgnc-generic-import.so()(64bit) \
libgnc-gnome-search.so()(64bit) \
libgnc-gnome-utils.so()(64bit) \
libgnc-gnome.so()(64bit) \
libgnc-html.so()(64bit) \
libgnc-ledger-core.so()(64bit) \
libgnc-locale-tax.so()(64bit) \
libgnc-log-replay.so()(64bit) \
libgnc-module.so()(64bit) \
libgnc-qif-import.so()(64bit) \
libgnc-register-core.so()(64bit) \
libgnc-register-gnome.so()(64bit) \
libgnc-report.so()(64bit) \
libgncmod-aqbanking.so()(64bit) \
libgncmod-backend-dbi.so()(64bit) \
libgncmod-backend-xml.so()(64bit) \
libgncmod-ofx.so()(64bit) \
libgncmod-python.so()(64bit) \
libgnucash-guile.so()(64bit) \
metainfo() \
metainfo(gnucash.appdata.xml) \
mimehandler(application/x-gnucash)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libaqbanking.so.44()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdbi.so.3()(64bit) \
libdbi.so.3(ABI_3)(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libguile-3.0.so.1()(64bit) \
libgwengui-gtk3.so.79()(64bit) \
libgwenhywfar.so.79()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libofx.so.7()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libsecret-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
