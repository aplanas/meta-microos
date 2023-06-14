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

RPROVIDES:${PN} += "config-gnucash \
gnucash \
libgnc-app-utils.so \
libgnc-backend-sql.so \
libgnc-backend-xml-utils.so \
libgnc-bi-import.so \
libgnc-core-utils.so \
libgnc-csv-export.so \
libgnc-csv-import.so \
libgnc-customer-import.so \
libgnc-engine.so \
libgnc-generic-import.so \
libgnc-gnome-search.so \
libgnc-gnome-utils.so \
libgnc-gnome.so \
libgnc-html.so \
libgnc-ledger-core.so \
libgnc-locale-tax.so \
libgnc-log-replay.so \
libgnc-module.so \
libgnc-qif-import.so \
libgnc-register-core.so \
libgnc-register-gnome.so \
libgnc-report.so \
libgncmod-aqbanking.so \
libgncmod-backend-dbi.so \
libgncmod-backend-xml.so \
libgncmod-ofx.so \
libgncmod-python.so \
libgnucash-guile.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libaqbanking.so.44 \
libboost-filesystem.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcairo.so.2 \
libdbi.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libguile-3.0.so.1 \
libgwengui-gtk3.so.79 \
libgwenhywfar.so.79 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libofx.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpython3.10.so.1.0 \
libsecret-1.so.0 \
libstdc++.so.6 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
