SUMMARY = "A Pythonic tool for remote execution and deployment"
DESCRIPTION = "Fabric is a Python library and command-line tool for \
streamlining the use of SSH for application deployment or systems \
administration tasks. \
 \
It provides a basic suite of operations for executing local or remote shell \
commands (normally or via sudo) and uploading/downloading files, as well as \
auxiliary functionality such as prompting the running user for input, or \
aborting execution. \
 \
In addition to being used via the fab tool, Fabric's components may be imported \
into other Python code, providing a Pythonic interface to the SSH protocol \
suite at a higher level than that provided by e.g. Paramiko (which \
Fabric itself leverages)."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python39-Fabric-2.7.1-3.4.noarch.rpm"
RPM_HASH = "281822060004c12ae070d52c9b6d419557dbf29d866a30edb92966e74f31e5304cd458389c56be66f3332cad6526b55d2afa1c99055a6e8a034f25e12566e960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fabric) \
python39-Fabric \
python39-Fabric2 \
python39-Fabric3 \
python39-fabric \
python39-fabric2 \
python3dist(fabric)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-cryptography \
python39-decorator \
python39-invoke \
python39-paramiko \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
