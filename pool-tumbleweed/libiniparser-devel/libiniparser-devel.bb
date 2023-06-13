SUMMARY = "Libraries and Header Files to Develop Programs with libiniparser Support"
DESCRIPTION = "This package contains the static libraries and header files needed to \
develop programs which make use of the libiniparser programming \
interface. \
 \
The libiniparser offers parsing of ini files from the C level.	See a \
complete documentation in HTML format, from the \
/usr/share/doc/packages/libiniparser-devel directory open the file \
html/index.html with any HTML-capable browser. \
 \
Libraries and Header Files to Develop Programs with iniparser Support."
LICENSE = "MIT"

PV = "4.1"

RPM_NAME = "libiniparser-devel-4.1-2.2.aarch64.rpm"
RPM_HASH = "9637ad9b0c0852afe614d108d9b5f9c19b28da54eef4cb984ac2b1238cf4130c125c7381b6bf53225bda560ffe2eef750d0a369f202a07136aecd694842f7fa0"

RPROVIDES:${PN} += "libiniparser-devel \
libiniparser-devel(aarch-64)"

RDEPENDS:${PN} += "libiniparser1"

inherit rpm
