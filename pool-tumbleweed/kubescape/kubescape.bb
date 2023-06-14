SUMMARY = "Tool providing a multi-cloud K8s single pane of glass"
DESCRIPTION = "Kubescape is a K8s open-source tool providing a multi-cloud K8s single pane of glass, including risk analysis, security compliance, RBAC visualizer and image vulnerabilities scanning. Kubescape scans K8s clusters, YAML files, and HELM charts, detecting misconfigurations according to multiple frameworks (such as the NSA-CISA , MITRE ATT&CK®), software vulnerabilities, and RBAC (role-based-access-control) violations at early stages of the CI/CD pipeline, calculates risk score instantly and shows risk trends over time. It became one of the fastest-growing Kubernetes tools among developers due to its easy-to-use CLI interface, flexible output formats, and automated scanning capabilities, saving Kubernetes users and admins’ precious time, effort, and resources. Kubescape integrates natively with other DevOps tools, including Jenkins, CircleCI, Github workflows, Prometheus, and Slack, and supports multi-cloud K8s deployments like EKS, GKE, and AKS."
LICENSE = "Apache-2.0"

PV = "2.3.4"

RPM_NAME = "kubescape-2.3.4-1.1.aarch64.rpm"
RPM_HASH = "b7d920552404527c017caf089bcb7cb05718b2d875e1387f0694287065156446018612e42be04c0eda184959a2bd63292cb6b23520dd06125e15b18d19e51f63"

RPROVIDES:${PN} += "kubescape"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
