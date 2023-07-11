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

RPM_NAME = "python311-Fabric-3.0.1-1.1.noarch.rpm"
RPM_HASH = "190176f339fd74480834ac8c8d7309167bfc01670c74b1c121f5ea0d3df1406052b3b98672e6d5aefd3bd70b1947def4da6c046df7de18b1f8fa57355f5a7fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Fabric \
python3-Fabric2 \
python3-Fabric3 \
python3-fabric \
python3-fabric2 \
python3.11dist-fabric \
python311-Fabric \
python311-Fabric2 \
python311-Fabric3 \
python311-fabric \
python311-fabric2 \
python3dist-fabric"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-decorator \
python311-invoke \
python311-paramiko \
update-alternatives"

inherit rpm
