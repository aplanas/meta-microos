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

RPM_NAME = "python310-Fabric-3.0.1-1.1.noarch.rpm"
RPM_HASH = "df816ca9f3689492df4eacc0ef32594505d27a28222595337da821c1b3cdc9d92eb411ffbe5f2d9bf25513242fb2eff7175e23a80df6a6d7b070db792917d4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fabric \
python310-Fabric \
python310-Fabric2 \
python310-Fabric3 \
python310-fabric \
python310-fabric2 \
python3dist-fabric"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-decorator \
python310-invoke \
python310-paramiko \
update-alternatives"

inherit rpm
