SUMMARY = "Java-based XML parser (documentation)"
DESCRIPTION = "Javadoc for aelfred."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "aelfred-javadoc-7.0-8.5.noarch.rpm"
RPM_HASH = "57c30a80bb12e0e7bfd8dac0961339f1bf8b0491281e13450bea9809e2346ed8c43ab774b3a30e2db9cb0388ed0c2a0a89b7d1df30b95c4c11f6fa5ee4e9b816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aelfred-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
