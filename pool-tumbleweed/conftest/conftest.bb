SUMMARY = "Tool to write tests against structured configuration data"
DESCRIPTION = "Conftest helps you write tests against structured configuration data. Using Conftest you can write tests for your Kubernetes configuration, Tekton pipeline definitions, Terraform code, Serverless configs or any other config files."
LICENSE = "Apache-2.0"

PV = "0.44.1"

RPM_NAME = "conftest-0.44.1-1.1.aarch64.rpm"
RPM_HASH = "634f2f5bf937e453e7e34addfada05121f39a253dfceeb46c3f24b6479cf330489c6e384df7f2287f42e305da6c75331d5edb12a0a2de2682a3f1f976e2d457f"

RPROVIDES:${PN} += "conftest"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
