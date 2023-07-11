SUMMARY = "The Cloud Native Application Proxy"
DESCRIPTION = "Traefik (pronounced traffic) is a modern HTTP reverse proxy and load balancer \
that makes deploying microservices easy. Traefik integrates with your existing \
infrastructure components (Docker, Swarm mode, Kubernetes, Marathon, Consul, \
Etcd, Rancher, Amazon ECS) and configures itself automatically and dynamically. \
 \
Pointing Traefik at your orchestrator should be the only configuration step you need."
LICENSE = "MIT"

PV = "2.10.1"

RPM_NAME = "traefik-2.10.1-1.1.aarch64.rpm"
RPM_HASH = "38b65424ce2cebb2949ee523c2556d0a14b32462e42e9b071868a47804b1f3c271a3068dc7a6f90cd6e487638ce79d136408e3bc12731f177457548222b1cdc2"

RPROVIDES:${PN} += "config-traefik \
traefik"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
