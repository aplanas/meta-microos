SUMMARY = "Tool to write tests against structured configuration data"
DESCRIPTION = "Conftest helps you write tests against structured configuration data. Using Conftest you can write tests for your Kubernetes configuration, Tekton pipeline definitions, Terraform code, Serverless configs or any other config files."
LICENSE = "Apache-2.0"

PV = "0.43.1"

RPM_NAME = "conftest-0.43.1-1.1.aarch64.rpm"
RPM_HASH = "13826659f3cbbca44fcc5ad0cfa1f14df10e7379a4b1c176c5c186ad67d70b96d63b4b1734e10a8acf58517b601e9a279833d1d4223a74672fa223b341702cf7"

RPROVIDES:${PN} += "conftest"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
