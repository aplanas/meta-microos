SUMMARY = "Binary files of dtxgen"
DESCRIPTION = "Binary files of dtxgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29031"

RPM_NAME = "texlive-dtxgen-bin-2023.20230311.svn29031-92.1.aarch64.rpm"
RPM_HASH = "26fdcbd654e03778e4c5d81d426ec61404e85875e8bbd66d7c142f421719e809e2339baa97684433ef85424180baac63b8b286313b61c85b1f3fd6e85891f8fa"

RPROVIDES:${PN} += "texlive-dtxgen-bin"

RDEPENDS:${PN} += "texlive-dtxgen"

inherit rpm
