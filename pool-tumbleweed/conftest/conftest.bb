SUMMARY = "Tool to write tests against structured configuration data"
DESCRIPTION = "Conftest helps you write tests against structured configuration data. Using Conftest you can write tests for your Kubernetes configuration, Tekton pipeline definitions, Terraform code, Serverless configs or any other config files."
LICENSE = "Apache-2.0"

PV = "0.42.1"

RPM_NAME = "conftest-0.42.1-1.1.aarch64.rpm"
RPM_HASH = "bbe4dc8c9d92830305cdcf645ae021cbe836c43d23165ad11e4e4271d5136f5d9c0715c5eb5d1a86c0ef115095660a13b8effa58cd079c0ca3e825fb9aa7df41"

RPROVIDES:${PN} += "conftest \
conftest(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
