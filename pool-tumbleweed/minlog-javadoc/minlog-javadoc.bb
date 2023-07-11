SUMMARY = "Javadoc for minlog"
DESCRIPTION = "This package contains javadoc for minlog."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "minlog-javadoc-1.3.1-1.4.noarch.rpm"
RPM_HASH = "87d7a01f68c737c1122d7f620b192addd9ec2818c2223e5de38ab0d26188c6e20b9ade37a1cc29f63bf2773792185b8dd9aa308282e0d1c44071351a2f32e18d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
