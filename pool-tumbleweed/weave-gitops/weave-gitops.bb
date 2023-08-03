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

PV = "0.28.0"

RPM_NAME = "weave-gitops-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "7aea082114d3f84963c9acce99a406e56665bb8728900bd90aa050dde7cb2b4f837087b959feb708955e638bf057b409c2ff406a2b357b8321d9ea7f6d2e7f1c"

RPROVIDES:${PN} += "weave-gitops"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
