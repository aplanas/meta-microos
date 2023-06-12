SUMMARY = "The Cloud Native Application Proxy"
DESCRIPTION = "Traefik (pronounced traffic) is a modern HTTP reverse proxy and load balancer \
that makes deploying microservices easy. Traefik integrates with your existing \
infrastructure components (Docker, Swarm mode, Kubernetes, Marathon, Consul, \
Etcd, Rancher, Amazon ECS) and configures itself automatically and dynamically. \
 \
Pointing Traefik at your orchestrator should be the only configuration step you need."
LICENSE = "MIT"

PV = "2.9.6"

RPM_NAME = "traefik-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "fea9c75a10fce6fa080464674824ee96fd053d50bdff8eb14eaa54fdf7c2492ef787d0c2e12e3428ea4a155db4863e4ce0bfd7004a733ddd351c699505a1533e"

RPROVIDES:${PN} += "config(traefik) \
traefik \
traefik(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
systemd"

inherit rpm
