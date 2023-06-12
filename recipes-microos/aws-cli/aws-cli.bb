SUMMARY = "Amazon Web Services Command Line Interface"
DESCRIPTION = "The AWS Command Line Interface (CLI) is a unified tool to manage AWS \
services. With this tool, multiple AWS services can be controlled \
from the command line and automated through scripts."
LICENSE = "Apache-2.0"

PV = "1.27.130"

RPM_NAME = "aws-cli-1.27.130-1.1.noarch.rpm"
RPM_HASH = "1329f3d028303ebcc6b42793b682e4830d574b40fb588807ad4c0d13efd202bee9337353fc27eafef0e5b5f2e49ae1ff0afdf181d44d50f797414191bc8c46f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-cli awscli config(aws-cli) python3.10dist(awscli) python3dist(awscli)"
RDEPENDS:${PN} += "/usr/bin/python3 groff python(abi) python3 python3-PyYAML python3-botocore python3-colorama python3-docutils python3-rsa python3-s3transfer python3-six"

inherit rpm
