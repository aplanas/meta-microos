SUMMARY = "Binary files of csplain"
DESCRIPTION = "Binary files of csplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50528"

RPM_NAME = "texlive-csplain-bin-2023.20230311.svn50528-93.2.aarch64.rpm"
RPM_HASH = "63c253d34c42cafc74f23b8dd1248530b1767b94b309eeb9a53f23b021cb056320317e03d932ff6ddae7607363792917e88186de34fb31b937b462cbbe8efdbb"

RPROVIDES:${PN} += "texlive-csplain-bin"

RDEPENDS:${PN} += "texlive-csplain"

inherit rpm
