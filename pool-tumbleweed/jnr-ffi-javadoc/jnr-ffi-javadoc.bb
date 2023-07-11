SUMMARY = "Javadocs for jnr-ffi"
DESCRIPTION = "This package contains the API documentation for jnr-ffi."
LICENSE = "Apache-2.0"

PV = "2.2.13"

RPM_NAME = "jnr-ffi-javadoc-2.2.13-1.2.noarch.rpm"
RPM_HASH = "205e61db50591d7faa45b03635e23d251abe48cdf7fbcfee893bd93ff701d4e92c8eee6291b3262565224beba092878afb28141aac50fd25075bcb96eafbbd81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-ffi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
