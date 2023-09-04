SUMMARY = "Weave Gitops CLI"
DESCRIPTION = "Weave GitOps is a simple open source developer platform for people who want cloud native applications, without needing Kubernetes expertise. Experience how easy it is to enable GitOps and run your apps in a cluster. Use git to collaborate with team members making new deployments easy and secure. Start with what developers need to run apps, and then easily extend to define and run your own enterprise platform. \
 \
From Kubernetes run Weave GitOps to get: \
 \
* Application Operations: manage and automate deployment pipelines for apps and more \
* Platforms: the easy way to have your own custom PaaS on cloud or on premise \
* Extensions: coordinate Kubernetes rollouts with eg. VMs, DBs and cloud services \
 \
Our vision is that all cloud native applications should be easy for developers, including operations which should be automated and secure. Weave GitOps is a highly extensible tool to achieve this by placing Kubernetes and GitOps at the core and building a platform around that. \
 \
We use GitOps tools throughout. Today Weave GitOps defaults are Flux, Kustomize, Helm, Sops and Kubernetes CAPI. If you use Flux already then you can easily add Weave GitOps to create a platform management overlay."
LICENSE = "MPL-2.0"

PV = "0.29.0"

RPM_NAME = "weave-gitops-0.29.0-1.1.aarch64.rpm"
RPM_HASH = "10944775966a9f404c701fc2dc1667d1bf9a03e950056301e57dc181ac5ea19c777e4997f2c7b4705a745c43cb63090e2a2acfd588ca4a78bf8c8227fd1aeb49"

RPROVIDES:${PN} += "weave-gitops"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
