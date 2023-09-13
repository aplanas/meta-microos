SUMMARY = "CLI and kubectl plugin for Kyverno"
DESCRIPTION = "Kyverno is a policy engine designed for Kubernetes. It can validate, mutate, and generate configurations using admission controls and background scans. Kyverno policies are Kubernetes resources and do not require learning a new language. Kyverno is designed to work nicely with tools you already use like kubectl, kustomize, and Git."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "kyverno-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "167f621f08d3a0c155f8a6b87ee9dac804e9fb7bb259c8acbc329bda08811742733eec8533cdb7e9a7b66c68481121b1e7112171b85dee52e6a2fc7a599cb5ab"

RPROVIDES:${PN} += "kyverno"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
