SUMMARY = "Tool to show who has permissions to verbs and resources in Kubernetes"
DESCRIPTION = "kubectl-who-can shows who has permissions \
to <verb> <resources> in kubernetes"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "kubectl-who-can-0.3.0-1.12.aarch64.rpm"
RPM_HASH = "624958af1e94f49b195157f0048e3ec1c82814c83294049d066729066fb0754c44e01e2d207fd4f6fc145b92209559573b1c080d91aab5f639ca66f0061ad023"

RPROVIDES:${PN} += "kubectl-who-can"

RDEPENDS:${PN} += ""

inherit rpm
