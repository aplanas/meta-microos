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

PV = "8.5.1"

RPM_NAME = "polaris-8.5.1-1.1.aarch64.rpm"
RPM_HASH = "70efd30a9d9cb557e5bd8f912f67adf69e8e934ed95b8ef7bc0c62ad54fdbc1d752bfba80cd0109e1b038d006be1fd98110524a352f238c9c84dcaa5d65fb119"

RPROVIDES:${PN} += "polaris"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
