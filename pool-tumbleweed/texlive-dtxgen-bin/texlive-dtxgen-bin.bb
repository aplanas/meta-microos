SUMMARY = "Binary files of dtxgen"
DESCRIPTION = "Binary files of dtxgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29031"

RPM_NAME = "texlive-dtxgen-bin-2023.20230311.svn29031-91.1.aarch64.rpm"
RPM_HASH = "ee78a05a78c07553df8a701868e902598cb4efa334a6f46b83513cc27de25ed495479c14d56a365c3cfe598a4d689e5033085cb0f900efacad085d5c2294d9c4"

RPROVIDES:${PN} += "texlive-dtxgen-bin"

RDEPENDS:${PN} += "texlive-dtxgen"

inherit rpm
