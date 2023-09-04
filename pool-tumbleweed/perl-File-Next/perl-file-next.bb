SUMMARY = "File-finding iterator"
DESCRIPTION = "File-finding iterator"
LICENSE = "Artistic-2.0"

PV = "1.18"

RPM_NAME = "perl-File-Next-1.18-1.17.aarch64.rpm"
RPM_HASH = "402a3c925438aac69e2551f84be32c28be3c069fe575f0427873223f0e1d80ca602c02f07e729c74e7664f61078aeede3a3c8706a04e77587b63db1db11ada26"

RPROVIDES:${PN} += "perl-File--Next \
perl-File-Next"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Temp \
perl-Test--More"

inherit rpm
