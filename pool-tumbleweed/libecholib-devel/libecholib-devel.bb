SUMMARY = "Development files for the EchoLink"
DESCRIPTION = "Development files for the EchoLink communications library"
LICENSE = "GPL-2.0-only"

PV = "1.3.2"

RPM_NAME = "libecholib-devel-1.3.2-5.10.aarch64.rpm"
RPM_HASH = "58ee6ea238f89b91260e038af959a22d1cf16b3161ecd263234233a4a4f4015fb993cfe93d38b4d46f6708b962c98c0f8d6136af5fe38b95c9dfdf4ff72b19e6"

RPROVIDES:${PN} += "libecholib-devel"

RDEPENDS:${PN} += "libecholib1-3"

inherit rpm
