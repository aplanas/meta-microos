SUMMARY = "WebUI for kanku"
DESCRIPTION = "WebUI for kanku using perl Dancer"
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-web-0.14.0-1.3.noarch.rpm"
RPM_HASH = "87901c7575136459921571d22620dc4ad8e16c563450999772eb9b16344d130f45dcca6f3135104454a67ea5901f173261a8c6e781039624b2f5bf9b90399a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(kanku-web) \
kanku-web \
perl(Dancer2::Plugin::GitLab::Webhook) \
perl(Kanku) \
perl(Kanku::REST) \
perl(Kanku::REST::Admin::Role) \
perl(Kanku::REST::Admin::Task) \
perl(Kanku::REST::Admin::User) \
perl(Kanku::REST::Guest) \
perl(Kanku::REST::Job) \
perl(Kanku::REST::JobComment) \
perl(Kanku::REST::JobGroup) \
perl(Kanku::REST::Worker)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
kanku-common \
kanku-common-server \
perl(Dancer2::Plugin::WebSocket) \
perl(Mail::Message::Body::String) \
perl(Mail::Transport::Send) \
perl(Net::AMQP::RabbitMQ) \
perl(Template::Plugin::JSON::Escape) \
perl(Twiggy) \
perl(UUID) \
smtp_daemon"

inherit rpm
