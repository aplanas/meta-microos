SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "jsch-demo-0.2.9-1.2.noarch.rpm"
RPM_HASH = "a28190ecae3ddcbbc5ac0741fa94249238fd5115004c87958020000869866e5fbb38cc36bfcde8f1de43edb5604faeb148496cc68cc7044c908559a67918e6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-demo"

RDEPENDS:${PN} += ""

inherit rpm
