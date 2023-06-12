SUMMARY = "Validate your Kubernetes configuration files"
DESCRIPTION = "kubeval is a tool for validating a Kubernetes YAML or JSON configuration file. It does so using schemas generated from the Kubernetes OpenAPI specification, and therefore can validate schemas for multiple versions of Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "kubeval-0.16.1-1.9.aarch64.rpm"
RPM_HASH = "ce8b2bc2e7c095e5bcddab7fee5e4f8e7ba8c22bfd40fc7bd3e0d2cd108468d2878edfb689c872fd8ff176cc916c14b91d203ce59b8dbd8c973e3bb526e7f82c"

RPROVIDES:${PN} += "kubeval \
kubeval(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
