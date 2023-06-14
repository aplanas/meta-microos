SUMMARY = "The Cloud Native Application Proxy"
DESCRIPTION = "Traefik (pronounced traffic) is a modern HTTP reverse proxy and load balancer \
that makes deploying microservices easy. Traefik integrates with your existing \
infrastructure components (Docker, Swarm mode, Kubernetes, Marathon, Consul, \
Etcd, Rancher, Amazon ECS) and configures itself automatically and dynamically. \
 \
Pointing Traefik at your orchestrator should be the only configuration step you need."
LICENSE = "MIT"

PV = "1.7.30"

RPM_NAME = "traefik1.7-1.7.30-2.10.aarch64.rpm"
RPM_HASH = "64492e050a68ade60444e34879f786efdac343b4948304e5aa63026bf6ee95164fe0d03ddda0ced4c0e4789c22bdf6aa5daab2d4d58fbd48ff6b85eb4734c70e"

RPROVIDES:${PN} += "config-traefik1.7 \
traefik1.7"

RDEPENDS:${PN} += "/bin/sh \
systemd"

inherit rpm
