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

PV = "8.3.0"

RPM_NAME = "polaris-8.3.0-1.1.aarch64.rpm"
RPM_HASH = "98379948427acca3f0d4e72806974e2515a0d60f35f9dd75d939c2d04cb8ac122a359880238cde3d9a081caf97faec394e0705eae6bc19121ab4764b80c7a92e"

RPROVIDES:${PN} += "polaris"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
