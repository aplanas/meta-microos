SUMMARY = "Aditional components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "baloo5-tools-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8d3138d6b0aed6b84ebb90e916e52353a3e8f4e62480fd234aa5f43897ef8e1d60d9f298913f1b92d710e8f9f5042cbbf47aa6714b74a2a1b5813756cd824d95"

RPROVIDES:${PN} += "baloo-tools \
baloo5-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5BalooEngine.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
