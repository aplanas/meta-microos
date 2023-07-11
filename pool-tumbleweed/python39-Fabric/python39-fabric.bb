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

PV = "3.0.1"

RPM_NAME = "python39-Fabric-3.0.1-1.1.noarch.rpm"
RPM_HASH = "3895a79e55c7f992641ffc96370d0107927f9cb067864384024565ef0fa0fdd478c7f2001a96ec032b0e9bce8312c40f2a42a99c656b5477177a6a6198c0c087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fabric \
python39-Fabric \
python39-Fabric2 \
python39-Fabric3 \
python39-fabric \
python39-fabric2 \
python3dist-fabric"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-decorator \
python39-invoke \
python39-paramiko \
update-alternatives"

inherit rpm
