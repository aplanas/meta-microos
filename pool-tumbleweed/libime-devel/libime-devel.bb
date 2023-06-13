SUMMARY = "Development files for libime"
DESCRIPTION = "This package provides development files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libime-devel-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "cce6207d76aa919e150411b794217f252398b54d4666d81014bca4c880824c03cddc0ba6fe44998410e40595cb00a822e7712432159701a20b5cc1cd7d2a891a"

RPROVIDES:${PN} += "cmake(LibIMECore) \
cmake(LibIMEPinyin) \
cmake(LibIMETable) \
libime-devel \
libime-devel(aarch-64)"

RDEPENDS:${PN} += "libIMECore0 \
libIMEPinyin0 \
libIMETable0"

inherit rpm
