SUMMARY = "Javadoc for jetty-unixsocket"
DESCRIPTION = "Javadoc for jetty-unixsocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-unixsocket-javadoc-9.4.51-1.1.noarch.rpm"
RPM_HASH = "95ca88411e4268c4f45f3b3ac085bf2cfa091d80d22dba293bb6c73f90bb74114ea6ba9b0f656618231c74d0efb0e910c9ebf2816f0ffef649b192b979bc760e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
