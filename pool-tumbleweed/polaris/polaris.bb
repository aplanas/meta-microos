SUMMARY = "Validation of best practices in your Kubernetes clusters"
DESCRIPTION = "Best Practices for Kubernetes Workload Configuration \
 \
Fairwinds' Polaris keeps your clusters sailing smoothly. It runs a variety of checks to ensure that Kubernetes pods and controllers are configured using best practices, helping you avoid problems in the future. \
 \
Polaris can be run in three different modes: \
* As a dashboard, so you can audit what's running inside your cluster. \
* As an admission controller, so you can automatically reject workloads that don't adhere to your organization's policies. \
* As a command-line tool, so you can test local YAML files, e.g. as part of a CI/CD process."
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "polaris-8.4.0-1.1.aarch64.rpm"
RPM_HASH = "48254ec459a6114b518f21ef1d599222e840f9d475c1cf21ea12fec7f457c962e9b93c52cae39bbd1ac6bcf03d47ab32cb3bd3d42b19956d913d3c8fd4924456"

RPROVIDES:${PN} += "polaris"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
