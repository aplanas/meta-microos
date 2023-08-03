SUMMARY = "Tool providing a multi-cloud K8s single pane of glass"
DESCRIPTION = "Kubescape is a K8s open-source tool providing a multi-cloud K8s single pane of glass, including risk analysis, security compliance, RBAC visualizer and image vulnerabilities scanning. Kubescape scans K8s clusters, YAML files, and HELM charts, detecting misconfigurations according to multiple frameworks (such as the NSA-CISA , MITRE ATT&CK®), software vulnerabilities, and RBAC (role-based-access-control) violations at early stages of the CI/CD pipeline, calculates risk score instantly and shows risk trends over time. It became one of the fastest-growing Kubernetes tools among developers due to its easy-to-use CLI interface, flexible output formats, and automated scanning capabilities, saving Kubernetes users and admins’ precious time, effort, and resources. Kubescape integrates natively with other DevOps tools, including Jenkins, CircleCI, Github workflows, Prometheus, and Slack, and supports multi-cloud K8s deployments like EKS, GKE, and AKS."
LICENSE = "Apache-2.0"

PV = "2.3.8"

RPM_NAME = "kubescape-2.3.8-1.1.aarch64.rpm"
RPM_HASH = "8e496d20f9733d68ed0f98bfdcb0ebc89e60d4a67b4d124cbb2b5850394bd2caa41b1ab0627986f6a6a55e0423fc6401e620a1b3df8f86047819b4b9e28db9fb"

RPROVIDES:${PN} += "kubescape"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
