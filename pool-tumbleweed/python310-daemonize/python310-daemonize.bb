SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-daemonize-2.5.0-4.3.noarch.rpm"
RPM_HASH = "d112320d502f34ea30c7dabc4ce2864395128e4952cc76417be20af848e64bd69abee3562ae158f29b974c72116c7a68a5f4efa6c10e53a14ed2a74978752220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-daemonize \
python310-daemonize \
python3dist-daemonize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
