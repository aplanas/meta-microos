SUMMARY = "Old Standard Font Family (OpenType Format)"
DESCRIPTION = "Old Standard was intended as a multilingual font family suitable for \
biblical, classical and medieval studies as well as for general-purpose \
typesetting in languages which use Greek or Cyrillic script. The font is \
currently available in three shapes: regular, italic and bold. Old \
Standard is still far from being finished, and yet it already covers \
a wide range of Latin, Greek and Cyrillic characters. It also supports \
early Cyrillic letters and signs (including those added in Unicode 5.1) \
and thus can be used for texts containing fragments in Old Slavonic and \
Church Slavonic languages. \
 \
This package contains fonts in OpenType format."
LICENSE = "OFL-1.1"

PV = "2.2"

RPM_NAME = "thessalonica-oldstandard-otf-fonts-2.2-11.18.noarch.rpm"
RPM_HASH = "7239281c39571702c7c8f5404df300730298b0c028f60a9c8c9c6a4e9e90852e8fb9b090e7dcaa11169611bd6381a080cbecaa64829c877aa372f1f904c2910b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(el;ru) \
oldstandard-fonts-otf \
thessalonica-oldstandard-otf-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
