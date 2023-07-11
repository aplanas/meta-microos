SUMMARY = "Tool providing a multi-cloud K8s single pane of glass"
DESCRIPTION = "Kubescape is a K8s open-source tool providing a multi-cloud K8s single pane of glass, including risk analysis, security compliance, RBAC visualizer and image vulnerabilities scanning. Kubescape scans K8s clusters, YAML files, and HELM charts, detecting misconfigurations according to multiple frameworks (such as the NSA-CISA , MITRE ATT&CK®), software vulnerabilities, and RBAC (role-based-access-control) violations at early stages of the CI/CD pipeline, calculates risk score instantly and shows risk trends over time. It became one of the fastest-growing Kubernetes tools among developers due to its easy-to-use CLI interface, flexible output formats, and automated scanning capabilities, saving Kubernetes users and admins’ precious time, effort, and resources. Kubescape integrates natively with other DevOps tools, including Jenkins, CircleCI, Github workflows, Prometheus, and Slack, and supports multi-cloud K8s deployments like EKS, GKE, and AKS."
LICENSE = "Apache-2.0"

PV = "2.3.7"

RPM_NAME = "kubescape-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "c68ebff48c03e17145eead7f7b07285d149b4e6346666c0180b9b73a3a17b301838c699e8c01223538b344ef1aefa38b167ec5589e7cd3f2774bf3c046a6982c"

RPROVIDES:${PN} += "kubescape"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
