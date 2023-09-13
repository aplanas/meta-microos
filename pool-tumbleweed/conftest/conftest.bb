SUMMARY = "Tool to write tests against structured configuration data"
DESCRIPTION = "Conftest helps you write tests against structured configuration data. Using Conftest you can write tests for your Kubernetes configuration, Tekton pipeline definitions, Terraform code, Serverless configs or any other config files."
LICENSE = "Apache-2.0"

PV = "0.45.0"

RPM_NAME = "conftest-0.45.0-1.1.aarch64.rpm"
RPM_HASH = "dd634c481118570f4ed85cec1dbfbb322a660b9dab0c0966113a058f053f3a82f426bdcdc185f812a3db11c9e99bb82e33900083b12760803a46d3ba6ddb1791"

RPROVIDES:${PN} += "conftest"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
