SUMMARY = "CLI and kubectl plugin for Kyverno"
DESCRIPTION = "Kyverno is a policy engine designed for Kubernetes. It can validate, mutate, and generate configurations using admission controls and background scans. Kyverno policies are Kubernetes resources and do not require learning a new language. Kyverno is designed to work nicely with tools you already use like kubectl, kustomize, and Git."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kyverno-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "01c57b224bfdea7b5c4540fe9990d7fc97764b7843355927ceae6ab5a723e9a9703bd458a4c1b55608179add4a752a36c5f443100d843b1fdac0f48389505cd4"

RPROVIDES:${PN} += "kyverno"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
