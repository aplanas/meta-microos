SUMMARY = "Tool providing a multi-cloud K8s single pane of glass"
DESCRIPTION = "Kubescape is a K8s open-source tool providing a multi-cloud K8s single pane of glass, including risk analysis, security compliance, RBAC visualizer and image vulnerabilities scanning. Kubescape scans K8s clusters, YAML files, and HELM charts, detecting misconfigurations according to multiple frameworks (such as the NSA-CISA , MITRE ATT&CK®), software vulnerabilities, and RBAC (role-based-access-control) violations at early stages of the CI/CD pipeline, calculates risk score instantly and shows risk trends over time. It became one of the fastest-growing Kubernetes tools among developers due to its easy-to-use CLI interface, flexible output formats, and automated scanning capabilities, saving Kubernetes users and admins’ precious time, effort, and resources. Kubescape integrates natively with other DevOps tools, including Jenkins, CircleCI, Github workflows, Prometheus, and Slack, and supports multi-cloud K8s deployments like EKS, GKE, and AKS."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "kubescape-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "26dc9d0bfe10d13c4077ea81598e135526d03983ee1100a937c440f4eac9e5234d7f7d410713388e99fbef39df05e807105ec202a3b9af2f13b0149cd21fa178"

RPROVIDES:${PN} += "kubescape"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
