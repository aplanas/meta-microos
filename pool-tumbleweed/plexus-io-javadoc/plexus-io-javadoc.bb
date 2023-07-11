SUMMARY = "Javadoc for plexus-io"
DESCRIPTION = "API documentation for plexus-io."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "plexus-io-javadoc-3.2.0-2.9.noarch.rpm"
RPM_HASH = "68ce8f6188ee601efa33ee55035fa304d476d08d56e692a6a6aa0a1c26112817f85f15915a0feca5e88519e8db84261a1d16fb794b48c79bdf16ca4495177be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
