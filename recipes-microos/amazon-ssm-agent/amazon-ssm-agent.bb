SUMMARY = "Amazon Remote System Config Management"
DESCRIPTION = "This package provides the Amazon SSM Agent for managing EC2 Instances using \
Amazon EC2 Systems Manager (SSM). \
 \
The SSM Agent runs on EC2 or on-premise instances and enables you to quickly \
and easily execute remote commands or scripts against one or more instances. \
When you execute a command, the agent on the instance processes the document \
and configures the instance as specified. \
 \
This collection of capabilities helps you automate management tasks such as \
collecting system inventory, applying operating system (OS) patches, automating \
the creation of Amazon Machine Images (AMIs), and configuring operating systems \
(OSs) and applications at scale. Systems Manager works with managed instances: \
Amazon EC2 instances, or servers and virtual machines (VMs) in your on-premises \
environment that are configured for Systems Manager."
LICENSE = "Apache-2.0"

PV = "3.2.815.0"

RPM_NAME = "amazon-ssm-agent-3.2.815.0-1.1.aarch64.rpm"
RPM_HASH = "2d0edec821ac7b85df113e3f0602c05906f8064d2058b3dbe4a67c0039c2c5250bef87f944fdf218de9c62df1d59bf17e02c1d3131ce556032a94152127dc820"

RPROVIDES:${PN} += "amazon-ssm-agent amazon-ssm-agent(aarch-64) bundled(golang(github.com/Microsoft/go-winio)) bundled(golang(github.com/Workiva/go-datastructures)) bundled(golang(github.com/aws/aws-sdk-go)) bundled(golang(github.com/carlescere/scheduler)) bundled(golang(github.com/cenkalti/backoff)) bundled(golang(github.com/cihub/seelog)) bundled(golang(github.com/coreos/go-semver)) bundled(golang(github.com/creack/pty)) bundled(golang(github.com/davecgh/go-spew)) bundled(golang(github.com/emirpasic/gods)) bundled(golang(github.com/fsnotify/fsnotify)) bundled(golang(github.com/gabs)) bundled(golang(github.com/go-git/gcfg)) bundled(golang(github.com/go-git/go-billy)) bundled(golang(github.com/go-git/go-git)) bundled(golang(github.com/go-github)) bundled(golang(github.com/go-ini/ini)) bundled(golang(github.com/go-yaml/yaml)) bundled(golang(github.com/google/go-querystring)) bundled(golang(github.com/google/shlex)) bundled(golang(github.com/gorhill/cronexpr)) bundled(golang(github.com/gorilla/websocket)) bundled(golang(github.com/hectane/go-acl)) bundled(golang(github.com/imdario/mergo)) bundled(golang(github.com/jbenet/go-context)) bundled(golang(github.com/jmespath/go-jmespath)) bundled(golang(github.com/kevinburke/ssh_config)) bundled(golang(github.com/lsegal/gucumber)) bundled(golang(github.com/mitchellh/go-homedir)) bundled(golang(github.com/mitchellh/go-ps)) bundled(golang(github.com/nightlyone/lockfile)) bundled(golang(github.com/pborman/ansi)) bundled(golang(github.com/pmezard/go-difflib)) bundled(golang(github.com/sergi/go-diff)) bundled(golang(github.com/shiena/ansicolor)) bundled(golang(github.com/stretchr/objx)) bundled(golang(github.com/stretchr/testify)) bundled(golang(github.com/twinj/uuid)) bundled(golang(github.com/xanzy/ssh-agent)) bundled(golang(github.com/xtaci/smux)) bundled(golang(go.nanomsg.org/mangos)) bundled(golang(golang.org/x/crypto)) bundled(golang(golang.org/x/net)) bundled(golang(golang.org/x/oauth2)) bundled(golang(golang.org/x/sync)) bundled(golang(golang.org/x/sys)) bundled(golang(gopkg.in/warnings.v0)) config(amazon-ssm-agent)"
RDEPENDS:${PN} += "/bin/sh systemd"

inherit rpm
